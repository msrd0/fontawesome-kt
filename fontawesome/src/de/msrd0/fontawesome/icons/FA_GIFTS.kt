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

/** Gifts */
object FA_GIFTS: Icon {
	
	override val name get() = "Gifts"
	
	override val unicode get() = "f79c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M192.5 55.09L217.9 36.59C228.6 28.79 243.6 31.16 251.4 41.88C259.2 52.6 256.8 67.61 246.1 75.41L217.8 95.1H240C256.9 95.1 271.7 104.7 280.3 117.9C257.3 135.7 241.9 162.1 240.2 193.1C212.5 201 192 226.1 192 256V480C192 491.7 195.1 502.6 200.6 512H48C21.49 512 0 490.5 0 464V144C0 117.5 21.49 96 48 96H70.2L41.88 75.41C31.16 67.61 28.79 52.6 36.59 41.88C44.39 31.16 59.4 28.79 70.12 36.59L97.55 56.54L89.23 31.59C85.04 19.01 91.84 5.423 104.4 1.232C116.1-2.96 130.6 3.836 134.8 16.41L144.7 46.17L155.4 15.99C159.8 3.493 173.5-3.048 186 1.377C198.5 5.802 205 19.52 200.6 32.01L192.5 55.09zM344.2 127.1C366.6 127.1 387.8 138.4 401.5 156.2L432 195.8L462.5 156.2C476.2 138.4 497.4 127.1 519.8 127.1C559.5 127.1 592 160.1 592 199.1C592 208.4 590.6 216.5 587.9 223.1H592C618.5 223.1 640 245.5 640 271.1V352H448V255.1H416V352H224V271.1C224 245.5 245.5 223.1 272 223.1H276.1C273.4 216.5 272 208.4 272 199.1C272 160.1 304.5 127.1 344.2 127.1H344.2zM363.5 185.5C358.9 179.5 351.7 175.1 344.2 175.1C330.8 175.1 320 186.9 320 199.1C320 213.3 330.7 223.1 344 223.1H393.1L363.5 185.5zM519.8 175.1C512.3 175.1 505.1 179.5 500.5 185.5L470.9 223.1H520C533.3 223.1 544 213.3 544 199.1C544 186.9 533.2 175.1 519.8 175.1H519.8zM224 464V384H416V512H272C245.5 512 224 490.5 224 464zM448 512V384H640V464C640 490.5 618.5 512 592 512H448z"/></svg>"""
		else -> null
	}
	
}
