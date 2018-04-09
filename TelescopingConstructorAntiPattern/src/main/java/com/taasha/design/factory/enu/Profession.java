package com.taasha.design.factory.enu;

public enum Profession {
	WARRIOR, THIEF, MAGE, PRIEST;

	@Override
	public String toString() {
		return name().toLowerCase();
	}

}
