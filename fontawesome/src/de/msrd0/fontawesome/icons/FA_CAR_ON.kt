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

/** Car On */
object FA_CAR_ON: Icon {
	
	override val name get() = "Car On"
	
	override val unicode get() = "e4dd"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M248 104C248 117.3 237.3 128 224 128C210.7 128 200 117.3 200 104V24C200 10.75 210.7 0 224 0C237.3 0 248 10.75 248 24V104zM153.8 160H294.2C327.1 160 358.1 181.3 369.5 213.1L397.8 292.4C417.9 300.9 432 320.8 432 344V480C432 497.7 417.7 512 400 512H384C366.3 512 352 497.7 352 480V448H96V480C96 497.7 81.67 512 64 512H48C30.33 512 16 497.7 16 480V344C16 320.8 30.08 300.9 50.16 292.4L78.49 213.1C89.86 181.3 120 160 153.8 160H153.8zM153.8 224C147.1 224 141 228.3 138.8 234.6L119.7 288H328.3L309.2 234.6C306.1 228.3 300.9 224 294.2 224H153.8zM96 392C109.3 392 120 381.3 120 368C120 354.7 109.3 344 96 344C82.75 344 72 354.7 72 368C72 381.3 82.75 392 96 392zM352 344C338.7 344 328 354.7 328 368C328 381.3 338.7 392 352 392C365.3 392 376 381.3 376 368C376 354.7 365.3 344 352 344zM7.029 39.03C16.4 29.66 31.6 29.66 40.97 39.03L88.97 87.03C98.34 96.4 98.34 111.6 88.97 120.1C79.6 130.3 64.4 130.3 55.03 120.1L7.029 72.97C-2.343 63.6-2.343 48.4 7.029 39.03V39.03zM407 39.03C416.4 29.66 431.6 29.66 440.1 39.03C450.3 48.4 450.3 63.6 440.1 72.97L392.1 120.1C383.6 130.3 368.4 130.3 359 120.1C349.7 111.6 349.7 96.4 359 87.03L407 39.03z"/></svg>"""
		else -> null
	}
	
}