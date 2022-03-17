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
import de.msrd0.fontawesome.Style.REGULAR

/** Scissors (Hand) */
object FA_HAND_SCISSORS: Icon {
	
	override val name get() = "Scissors (Hand)"
	
	override val unicode get() = "f257"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M512 192v111.1C512 383.4 447.4 448 368 448H288c-26.52 0-48-21.48-48-47.99c0-9.152 2.697-17.61 7.139-24.89C224.9 370.1 208 351.5 208 328c0-16.72 8.561-31.4 21.52-39.1H40c-22.09 0-40-17.9-40-39.99s17.91-39.1 40-39.1h229.5L60 142.2C42.93 136.8 31.99 121.1 31.99 104c0-3.973 .5967-8.014 1.851-12.01c5.35-17.07 21.08-28.04 38.06-28.04c4 0 8.071 .6085 12.09 1.889l279.2 87.22C364.8 153.6 366.4 153.8 368 153.8c6.812 0 13.12-4.375 15.27-11.23c.4978-1.588 .7346-3.195 .7346-4.777c0-6.807-4.388-13.12-11.23-15.25l-72.54-22.67l14.29-17.85C323.6 70.67 337.4 64.04 352 64.04h48c10.39 0 20.48 3.359 28.8 9.592l38.41 28.79c25.2 18.91 40.53 47.97 43.55 79.04C511.5 184.9 512 188.4 512 192z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M270.1 480h97.92C447.4 480 512 417.1 512 339.7V231.8c0-23.45-6.106-46.73-17.66-67.33l-31.35-55.85C447.5 81.1 417.1 64 385.9 64h-46.97c-26.63 0-51.56 11.63-68.4 31.93l-15.46 18.71L127.3 68.44C119 65.46 110.5 64.05 102.1 64.05c-30.02 0-58.37 18.06-69.41 47.09C15.06 156.8 46.19 194 76.75 204.9l2.146 .7637L68.79 206.4C30.21 209 0 241.2 0 279.3c0 39.7 33.27 72.09 73.92 72.09c1.745 0 3.501-.0605 5.268-.1833l88.79-6.135v8.141c0 22.11 10.55 43.11 28.05 56.74C197.4 448.8 230.2 480 270.1 480zM269.1 432c-14.34 0-26-11.03-26-24.62c0 0 .0403-14.31 .0403-14.71c0-6.894-4.102-14.2-10.67-16.39c-10.39-3.5-17.38-12.78-17.38-23.06v-13.53c0-16.98 13.7-16.4 13.7-29.89c0-9.083-7.392-15.96-15.96-15.96c-.3646 0-.7311 .0125-1.099 .0377c0 0-138.1 9.505-138.7 9.505c-14.32 0-25.93-11.04-25.93-24.49c0-13.28 10.7-23.74 24.1-24.64l163.2-11.28c2.674-.1882 14.92-2.907 14.92-16.18c0-6.675-4.284-12.58-10.65-14.85L92.84 159.7C85.39 156.1 75.97 149.4 75.97 136.7c0-11.14 9.249-24.66 25.97-24.66c3.043 0 6.141 .5115 9.166 1.59l234.1 85.03c1.801 .6581 3.644 .9701 5.456 .9701c8.96 0 16-7.376 16-15.1c0-6.514-4.068-12.69-10.59-15.04l-64.81-23.47l15.34-18.56C315.2 117.3 326.6 112 338.9 112h46.97c14.77 0 28.28 7.719 35.27 20.16L452.5 188c7.531 13.41 11.52 28.56 11.52 43.81v107.9c0 50.91-43.06 92.31-96 92.31H269.1z"/></svg>"""
		else -> null
	}
	
}
