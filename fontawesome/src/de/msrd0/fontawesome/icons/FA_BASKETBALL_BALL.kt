/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

object FA_BASKETBALL_BALL: Icon {
	
	override val name get() = "Basketball Ball"
	
	override val unicode get() = "f434"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M148.7 171.3L64.21 86.83c-28.39 32.16-48.9 71.38-58.3 114.8C19.41 205.4 33.34 208 48 208C86.34 208 121.1 193.9 148.7 171.3zM194.5 171.9L256 233.4l169.2-169.2C380 24.37 320.9 0 256 0C248.6 0 241.2 .4922 233.1 1.113C237.8 16.15 240 31.8 240 48C240 95.19 222.8 138.4 194.5 171.9zM208 48c0-14.66-2.623-28.59-6.334-42.09C158.2 15.31 118.1 35.82 86.83 64.21l84.48 84.48C193.9 121.1 208 86.34 208 48zM171.9 194.5C138.4 222.8 95.19 240 48 240c-16.2 0-31.85-2.236-46.89-6.031C.4922 241.2 0 248.6 0 256c0 64.93 24.37 124 64.21 169.2L233.4 256L171.9 194.5zM317.5 340.1L256 278.6l-169.2 169.2C131.1 487.6 191.1 512 256 512c7.438 0 14.75-.4922 22.03-1.113C274.2 495.8 272 480.2 272 464C272 416.8 289.2 373.6 317.5 340.1zM363.3 340.7l84.48 84.48c28.39-32.16 48.9-71.38 58.3-114.8C492.6 306.6 478.7 304 464 304C425.7 304 390.9 318.1 363.3 340.7zM447.8 86.83L278.6 256l61.52 61.52C373.6 289.2 416.8 272 464 272c16.2 0 31.85 2.236 46.89 6.031C511.5 270.8 512 263.4 512 256C512 191.1 487.6 131.1 447.8 86.83zM304 464c0 14.66 2.623 28.59 6.334 42.09c43.46-9.4 82.67-29.91 114.8-58.3l-84.48-84.48C318.1 390.9 304 425.7 304 464z"/></svg>"""
		else -> null
	}
	
}

val FA_BASKETBALL_BALL = FA_BASKETBALL_BALL
