// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2024 MIT, All rights reserved
// Released under the Apache License, Version 2.0
// http://www.apache.org/licenses/LICENSE-2.0

package com.google.appinventor.components.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines a parameter of Orientation used by the ListView component.
 */
public enum Orientation implements OptionList<Integer> {
  @Default
  Vertical(0),
  Horizontal(1);

  private final int orientation;

   Orientation(int value) {
    this.orientation = value;
  } 

  public Integer toUnderlyingValue() {
    return orientation;
  }

  private static final Map<Integer, Orientation> lookup = new HashMap<>();

  static {
    for(Orientation value : Orientation.values()) {
      lookup.put(value.toUnderlyingValue(), value);
    }
  }

  public static Orientation fromUnderlyingValue(Integer value) {
    return lookup.get(value);
  }

  public static Orientation fromUnderlyingValue(String value) {
    return fromUnderlyingValue(Integer.parseInt(value));
  }
}