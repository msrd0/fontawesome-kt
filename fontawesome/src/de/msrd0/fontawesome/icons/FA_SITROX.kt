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
import de.msrd0.fontawesome.Style.BRANDS

object FA_SITROX: Icon {
	
	override val name get() = "Sitrox"
	
	override val unicode get() = "e44a"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M212.439 0.00846128V0H448V128H64C64 57.6008 141.755 0.475338 212.439 0.00846128ZM237.256 192V192.007C307.135 192.475 384 249.6 384 320H210.809V319.995C140.915 319.563 64 262.424 64 192H237.256ZM235.565 511.993C306.251 511.521 384 454.399 384 384H0V512H235.565V511.993Z"/></svg>"""
		else -> null
	}
	
}
