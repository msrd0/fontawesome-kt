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

/** Lines Leaning */
object FA_LINES_LEANING: Icon {
	
	override val name get() = "Lines Leaning"
	
	override val unicode get() = "e51e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M62.36 458.1C56.77 474.9 38.65 483.9 21.88 478.4C5.116 472.8-3.946 454.6 1.643 437.9L129.6 53.88C135.2 37.12 153.4 28.05 170.1 33.64C186.9 39.23 195.9 57.35 190.4 74.12L62.36 458.1zM261.3 32.44C278.7 35.34 290.5 51.83 287.6 69.26L223.6 453.3C220.7 470.7 204.2 482.5 186.7 479.6C169.3 476.7 157.5 460.2 160.4 442.7L224.4 58.74C227.3 41.31 243.8 29.53 261.3 32.44H261.3zM352 32C369.7 32 384 46.33 384 64V448C384 465.7 369.7 480 352 480C334.3 480 320 465.7 320 448V64C320 46.33 334.3 32 352 32V32z"/></svg>"""
		else -> null
	}
	
}
