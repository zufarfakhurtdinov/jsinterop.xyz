package xyz.jsinterop.client.dom;

/*
 * #%L
 * jsinterop
 * %%
 * Copyright (C) 2016 Norbert Sándor
 * %%
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * #L%
 */

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import xyz.jsinterop.client.core.ArrayBufferView;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface RandomSource {
	@JsMethod
	public abstract ArrayBufferView getRandomValues(final ArrayBufferView array);
}
