package com.github.chessgame.util;

import java.io.Serializable;

/**
 * Android 5 doesn't support java.util.function.Function. Therefor backported here.
 */
public interface Function<A, R> extends Serializable {
    R call(A value);
}
