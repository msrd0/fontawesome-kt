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
import de.msrd0.fontawesome.Style.BRANDS

object FA_FONT_AWESOME: Icon {
	
	override val name get() = "Font Awesome"
	
	override val unicode get() = "f2b4"
	
	override val styles get() = setOf(SOLID, REGULAR, BRANDS)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M448 48V384c-63.09 22.54-82.34 32-119.5 32c-62.82 0-86.6-32-149.3-32C158.6 384 142.6 387.6 128 392.2v-64C142.6 323.6 158.6 320 179.2 320c62.73 0 86.51 32 149.3 32C348.9 352 364.1 349 384 342.7v-208C364.1 141 348.9 144 328.5 144c-62.82 0-86.6-32-149.3-32C128.4 112 104.3 132.6 64 140.7v307.3C64 465.7 49.67 480 32 480S0 465.7 0 448V63.1C0 46.33 14.33 32 31.1 32S64 46.33 64 63.1V76.66C104.3 68.63 128.4 48 179.2 48c62.73 0 86.51 32 149.3 32C365.7 80 384.9 70.54 448 48z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M448 48V384c-63.09 22.54-82.34 32-119.5 32c-62.82 0-86.6-32-149.3-32c-21.69 0-38.48 3.791-53.74 8.766C110.1 397.5 96 386.1 96 371.7v-.7461c0-9.275 5.734-17.6 14.42-20.86C129.1 342.8 150.2 336 179.2 336c62.73 0 86.51 32 149.3 32c25.5 0 42.85-4.604 71.47-14.7v-240C379.2 120.6 357.7 128 328.5 128c-.0039 0 .0039 0 0 0c-62.81 0-86.61-32-149.3-32C122.1 96 98.8 122.1 48 126.1V456C48 469.3 37.25 480 24 480S0 469.3 0 456V56C0 42.74 10.75 32 24 32S48 42.74 48 56v22.99C98.8 74.14 122.1 48 179.2 48c62.77 0 86.45 32 149.3 32C366.1 80 386.8 69.85 448 48z"/></svg>"""
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M448 48V384C385 407 366 416 329 416C266 416 242 384 179 384C159 384 143 388 128 392V328C143 324 159 320 179 320C242 320 266 352 329 352C349 352 364 349 384 343V135C364 141 349 144 329 144C266 144 242 112 179 112C128 112 104 133 64 141V448C64 466 50 480 32 480S0 466 0 448V64C0 46 14 32 32 32S64 46 64 64V77C104 69 128 48 179 48C242 48 266 80 329 80C366 80 385 71 448 48Z"/></svg>"""
		else -> null
	}
	
}

val FA_FONT_AWESOME_FLAG = FA_FONT_AWESOME

val FA_FONT_AWESOME_LOGO_FULL = FA_FONT_AWESOME
