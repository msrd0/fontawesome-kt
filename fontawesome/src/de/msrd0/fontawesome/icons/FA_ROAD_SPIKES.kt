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

/** Road Spikes */
object FA_ROAD_SPIKES: Icon {
	
	override val name get() = "Road Spikes"
	
	override val unicode get() = "e568"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M64 116.8C64 101 84.53 94.79 93.31 107.1L192 255.1V116.8C192 101 212.5 94.79 221.3 107.1L320 255.1V116.8C320 101 340.5 94.79 349.3 107.1L448 255.1V116.8C448 101 468.5 94.79 477.3 107.1L606.8 302.2C621 323.5 605.8 351.1 580.2 351.1H64L64 116.8zM608 383.1C625.7 383.1 640 398.3 640 415.1C640 433.7 625.7 447.1 608 447.1H32C14.33 447.1 0 433.7 0 415.1C0 398.3 14.33 383.1 32 383.1H608z"/></svg>"""
		else -> null
	}
	
}
