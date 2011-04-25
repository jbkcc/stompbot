package com.youbroughther.stompbot;

import java.util.ArrayList;

public class EffectInput extends Effect {
	public EffectInput() {
		super("Input");
		ArrayList<EffectIOKnob> knobs = new ArrayList<EffectIOKnob>();
		knobs.add(new EffectIOKnob("Pre-Gain"));
		this._knobs = knobs;
		ArrayList<EffectIOSwitch> switches = new ArrayList<EffectIOSwitch>();
		switches.add(new EffectIOSwitch("High Gain"));
		this._switches = switches;
		ArrayList<EffectIOLED> leds = new ArrayList<EffectIOLED>();
		leds.add(new EffectIOLED("Level"));
		this._leds = leds;
	}
}