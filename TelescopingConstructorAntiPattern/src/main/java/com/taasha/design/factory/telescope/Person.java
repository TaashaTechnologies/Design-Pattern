package com.taasha.design.factory.telescope;

import com.taasha.design.factory.enu.HairColor;
import com.taasha.design.factory.enu.HairType;
import com.taasha.design.factory.enu.Profession;

public class Person {

	private Profession profession;
	private String name;
	private HairType hairType;
	private HairColor hairColor;

	private Person(Builder builder) {
		this.profession = builder.profession;
		this.name = builder.name;
		this.hairColor = builder.hairColor;
		this.hairType = builder.hairType;

	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HairType getHairType() {
		return hairType;
	}

	public void setHairType(HairType hairType) {
		this.hairType = hairType;
	}

	public HairColor getHairColor() {
		return hairColor;
	}

	public void setHairColor(HairColor hairColor) {
		this.hairColor = hairColor;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("This is a ").append(profession).append(" named ").append(name);

		if (hairColor != null || hairType != null) {
			sb.append(" with ");
			if (hairColor != null) {
				sb.append(hairColor).append(' ');
			}
			if (hairType != null) {
				sb.append(hairType).append(' ');
			}
			sb.append(hairType != HairType.BALD ? "hair" : "head");
		}

		sb.append('.');
		return sb.toString();
	}

	public static class Builder {

		private final Profession profession;
		private final String name;
		private HairType hairType;
		private HairColor hairColor;

		public Builder(Profession profession, String name) {
			if (profession == null || name == null) {
				throw new IllegalArgumentException("profession and name can not be null");
			}
			this.profession = profession;
			this.name = name;
		}

		public Builder withHairType(HairType hairType) {
			this.hairType = hairType;
			return this;
		}

		public Builder withHairColor(HairColor hairColor) {
			this.hairColor = hairColor;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}
}
