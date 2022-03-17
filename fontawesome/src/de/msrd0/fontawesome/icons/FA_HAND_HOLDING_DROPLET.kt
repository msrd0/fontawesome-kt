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

/** Hand holding droplet */
object FA_HAND_HOLDING_DROPLET: Icon {
	
	override val name get() = "Hand holding droplet"
	
	override val unicode get() = "f4c1"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M287.1 256c53 0 95.1-42.13 95.1-93.1c0-40-57.12-120.8-83.25-155.6c-6.375-8.5-19.12-8.5-25.5 0C249.1 41.25 191.1 122 191.1 162C191.1 213.9 234.1 256 287.1 256zM568.2 336.3c-13.12-17.81-38.14-21.66-55.93-8.469l-119.7 88.17h-120.6c-8.748 0-15.1-7.25-15.1-15.99c0-8.75 7.25-16 15.1-16h78.25c15.1 0 30.75-10.88 33.37-26.62c3.25-20-12.12-37.38-31.62-37.38H191.1c-26.1 0-53.12 9.25-74.12 26.25l-46.5 37.74L15.1 383.1c-8.748 0-15.1 7.274-15.1 16.02L.0001 496C.0001 504.8 7.251 512 15.1 512h346.1c22.03 0 43.92-7.188 61.7-20.27l135.1-99.52C577.5 379.1 581.3 354.1 568.2 336.3z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_HAND_HOLDING_DROPLET]. */
val FA_HAND_HOLDING_WATER = FA_HAND_HOLDING_DROPLET
