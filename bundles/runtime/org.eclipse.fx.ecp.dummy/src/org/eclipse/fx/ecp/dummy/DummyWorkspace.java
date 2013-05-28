package org.eclipse.fx.ecp.dummy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.EventObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.util.observer.ECPProvidersChangedObserver;
import org.eclipse.emf.ecp.spi.core.InternalProvider;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.emfstore.bowling.BowlingFactory;
import org.eclipse.emf.emfstore.bowling.Gender;
import org.eclipse.emf.emfstore.bowling.League;
import org.eclipse.emf.emfstore.bowling.Matchup;
import org.eclipse.emf.emfstore.bowling.Player;
import org.eclipse.emf.emfstore.bowling.Referee;
import org.eclipse.emf.emfstore.bowling.Tournament;
import org.eclipse.emf.emfstore.bowling.TournamentType;
import org.eclipse.emf.emfstore.bowling.provider.BowlingItemProviderAdapterFactory;

public class DummyWorkspace {

	public static DummyWorkspace INSTANCE = new DummyWorkspace();

	EditingDomain editingDomain;
	List<ECPProvidersChangedObserver> providerChangedObservers = new ArrayList<>();

	DummyRepository repository;
	DummyProvider provider = new DummyProvider();
	Map<String, DummyProject> projects = new HashMap<>();
	BasicCommandStack commandStack;

	ComposedAdapterFactory adapterFactory;

	private Tournament tournament;

	private Player hans;

	private Referee referee;

	public DummyWorkspace() {
		// Create an adapter factory that yields item providers.
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new BowlingItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// Create the command stack that will notify this editor as commands are
		// executed.
		BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to
		// be the selection of the viewer with focus.
		commandStack.addCommandStackListener(new CommandStackListener() {
			public void commandStackChanged(final EventObject event) {
				// TODO: notify listeners
			}
		});

		// Create the editing domain with a special command stack.
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());

		// create the repository
		repository = new DummyRepository();
		repository.setName("Repository 1");

		// create a project
		DummyProject project1 = createProject("Project 1");

		tournament = BowlingFactory.eINSTANCE.createTournament();
		project1.getResource().getContents().add(tournament);

		tournament.getPriceMoney().add(1.55);
		tournament.getPriceMoney().add(1000.0);

		tournament.getReceivesTrophy().add(false);
		tournament.getReceivesTrophy().add(true);

		tournament.getMatchDays().add(new Date(0));
		tournament.getMatchDays().add(new Date());

		Matchup matchup = BowlingFactory.eINSTANCE.createMatchup();
		matchup.setNrSpectators(new BigInteger("21"));
		tournament.getMatchups().add(matchup);

		League league = BowlingFactory.eINSTANCE.createLeague();
		league.setName("Premier League");

		hans = BowlingFactory.eINSTANCE.createPlayer();
		hans.setName("Hans Wurst");
		hans.setDateOfBirth(new Date(0));
		hans.setHeight(1.76);
		hans.setIsProfessional(true);
		hans.getEMails().add("h.wurst@work.com");
		hans.getEMails().add("wursti@gmail.com");
		hans.setNumberOfVictories(4);
		hans.getPlayedTournamentTypes().add(TournamentType.AMATEUR);
		hans.getPlayedTournamentTypes().add(TournamentType.PRO);
		hans.setWinLossRatio(new BigDecimal(0.6));
		hans.setGender(Gender.MALE);
		tournament.getPlayers().add(hans);
		league.getPlayers().add(hans);

		referee = BowlingFactory.eINSTANCE.createReferee();
		project1.getResource().getContents().add(referee);
		referee.setLeague(league);
	}

	DummyProject createProject(String projectName) {
		DummyProject project = new DummyProject();
		Resource resource = editingDomain.getResourceSet().createResource(URI.createURI(""));
		project.setName(projectName);
		project.setResource(resource);
		projects.put(projectName, project);
		return project;
	}

	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	public DummyRepository getRepository() {
		return repository;
	}

	public InternalProvider getProvider() {
		return provider;
	}

	public void addProvidersChangedObserver(ECPProvidersChangedObserver observer) {
		providerChangedObservers.add(observer);
	}

	public void removeProvidersChangedObserver(ECPProvidersChangedObserver observer) {
		providerChangedObservers.remove(observer);
	}

	public Collection<ECPProject> getProjects() {
		HashSet<ECPProject> hashSet = new HashSet<>();
		hashSet.addAll(projects.values());
		return Collections.unmodifiableCollection(hashSet);
	}

	public ComposedAdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	public EObject getTournament() {
		return tournament;
	}

	public EObject getPlayer() {
		return hans;
	}

	public EObject getReferee() {
		return referee;
	}

}
