package com.sandjelkovic

import java.time.Duration

/**
 * @author sandjelkovic
 * @date 14.6.18.
 */
operator fun Duration.unaryMinus(): Duration = this.negated()
