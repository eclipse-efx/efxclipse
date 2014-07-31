package org.eclipse.fx.ide.gradient.app.util;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Paint;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;

import org.eclipse.fx.ide.gradient.model.gradient.FxColor;
import org.eclipse.fx.ide.gradient.model.gradient.FxCycleMethod;
import org.eclipse.fx.ide.gradient.model.gradient.FxGradient;
import org.eclipse.fx.ide.gradient.model.gradient.FxLinearGradient;
import org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient;
import org.eclipse.fx.ide.gradient.model.gradient.FxStop;
import org.eclipse.fx.ide.gradient.model.gradient.GradientFactory;
import org.eclipse.fx.ide.gradient.model.gradient.RgbFxColor;

public class GradientConverter {
	public static Paint convertGradient(FxGradient g) {
		if (g == null) {
			return null;
		}
		if (g instanceof FxLinearGradient) {
			return convertLinearGradient((FxLinearGradient) g);
		} else if (g instanceof FxRadialGradient) {
			return convertRadialGradient((FxRadialGradient) g);
		} else {
			throw new UnsupportedOperationException(
					"Gradient conversion not implemented for type " + g.getClass()); //$NON-NLS-1$
		}
	}

	public static LinearGradient convertLinearGradient(FxLinearGradient g) {
		if (g == null) {
			return null;
		}
		return new LinearGradient(g.getStartX(), g.getStartY(), g.getEndX(),
				g.getEndY(), g.isProportional(),
				convertCycleMethod(g.getCycleMethod()),
				convertFxStops(g.getStops()));
	}

	public static RadialGradient convertRadialGradient(FxRadialGradient g) {
		if (g == null) {
			return null;
		}
		return new RadialGradient(g.getFocusAngle(), g.getFocusDistance(),
				g.getCenterX(), g.getCenterY(), g.getRadius(),
				g.isProportional(), convertCycleMethod(g.getCycleMethod()),
				convertFxStops(g.getStops()));
	}

	public static List<Stop> convertFxStops(List<FxStop> stops) {
		List<Stop> fxStops = new ArrayList<Stop>();
		if (stops != null) {
			for (FxStop s : stops) {
				fxStops.add(convertStop(s));
			}
		}
		return fxStops;
	}

	public static List<FxStop> convertStops(List<Stop> stops) {
		List<FxStop> fxStops = new ArrayList<FxStop>();
		if (stops != null) {
			for (Stop s : stops) {
				fxStops.add(convertStop(s));
			}
		}
		return fxStops;
	}

	public static Stop convertStop(FxStop s) {
		if (s == null) {
			return null;
		}
		return new Stop(s.getOffset(), convertColor(s.getColor()));
	}

	public static FxStop convertStop(Stop s) {
		if (s == null) {
			return null;
		}
		FxStop stop = GradientFactory.eINSTANCE.createFxStop();
		stop.setOffset(s.getOffset());
		stop.setColor(convertRgbColor(s.getColor()));
		return stop;
	}

	public static Color convertColor(FxColor color) {
		if (color == null) {
			return null;
		}
		if (color instanceof RgbFxColor) {
			RgbFxColor rgb = (RgbFxColor) color;
			return new Color(rgb.getRed(), rgb.getGreen(), rgb.getBlue(),
					rgb.getOpacity());
		} else {
			throw new UnsupportedOperationException(
					"Color conversion not implemented for type " + color.getClass()); //$NON-NLS-1$
		}
	}

	public static RgbFxColor convertRgbColor(Color color) {
		if (color == null) {
			return null;
		}
		RgbFxColor rgb = GradientFactory.eINSTANCE.createRgbFxColor();
		rgb.setRed(color.getRed());
		rgb.setGreen(color.getGreen());
		rgb.setBlue(color.getBlue());
		rgb.setOpacity(color.getOpacity());
		return rgb;
	}

	public static CycleMethod convertCycleMethod(FxCycleMethod cycleMethod) {
		switch (cycleMethod) {
		case NO_CYCLE:
			return CycleMethod.NO_CYCLE;
		case REFLECT:
			return CycleMethod.REFLECT;
		case REPEAT:
			return CycleMethod.REPEAT;
		default:
			throw new UnsupportedOperationException(
					"unknown cycle method: " + cycleMethod); //$NON-NLS-1$
		}
	}

	public static FxCycleMethod convertCycleMethod(CycleMethod cycleMethod) {
		switch (cycleMethod) {
		case NO_CYCLE:
			return FxCycleMethod.NO_CYCLE;
		case REFLECT:
			return FxCycleMethod.REFLECT;
		case REPEAT:
			return FxCycleMethod.REPEAT;
		default:
			throw new UnsupportedOperationException(
					"unknown cycle method: " + cycleMethod); //$NON-NLS-1$
		}
	}
}
