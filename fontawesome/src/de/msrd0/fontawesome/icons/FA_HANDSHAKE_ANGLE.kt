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

/** Handshake angle */
object FA_HANDSHAKE_ANGLE: Icon {
	
	override val name get() = "Handshake angle"
	
	override val unicode get() = "f4c4"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M488 191.1h-152l.0001 51.86c.0001 37.66-27.08 72-64.55 75.77c-43.09 4.333-79.45-29.42-79.45-71.63V126.4l-24.51 14.73C123.2 167.8 96.04 215.7 96.04 267.5L16.04 313.8c-15.25 8.751-20.63 28.38-11.75 43.63l80 138.6c8.875 15.25 28.5 20.5 43.75 11.75l103.4-59.75h136.6c35.25 0 64-28.75 64-64c26.51 0 48-21.49 48-48V288h8c13.25 0 24-10.75 24-24l.0001-48C512 202.7 501.3 191.1 488 191.1zM635.7 154.5l-79.95-138.6c-8.875-15.25-28.5-20.5-43.75-11.75l-103.4 59.75h-62.57c-37.85 0-74.93 10.61-107.1 30.63C229.7 100.4 224 110.6 224 121.6l-.0004 126.4c0 22.13 17.88 40 40 40c22.13 0 40-17.88 40-40V159.1h184c30.93 0 56 25.07 56 56v28.5l80-46.25C639.3 189.4 644.5 169.8 635.7 154.5z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_HANDSHAKE_ANGLE]. */
val FA_HANDS_HELPING = FA_HANDSHAKE_ANGLE
