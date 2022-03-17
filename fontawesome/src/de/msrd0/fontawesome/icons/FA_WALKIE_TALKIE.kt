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

object FA_WALKIE_TALKIE: Icon {
	
	override val name get() = "Walkie Talkie"
	
	override val unicode get() = "f8ef"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M352 96h-32V80C320 71.16 312.8 64 304 64h-32C263.2 64 256 71.16 256 80V96h-32V80C224 71.16 216.8 64 208 64h-32C167.2 64 160 71.16 160 80V96H112V23.1C112 10.74 101.3 0 88 0S64 10.74 64 23.1V96H32C14.4 96 0 110.4 0 128v178.7c0 8.484 3.373 16.62 9.371 22.62L32 352v112C32 490.5 53.49 512 80 512h224c26.51 0 48-21.49 48-48V352l22.63-22.63C380.6 323.4 384 315.2 384 306.7V128C384 110.4 369.6 96 352 96zM288 312C288 316.4 284.4 320 280 320h-176C99.63 320 96 316.4 96 312v-16C96 291.6 99.63 288 104 288h176C284.4 288 288 291.6 288 296V312zM288 248C288 252.4 284.4 256 280 256h-176C99.63 256 96 252.4 96 248v-16C96 227.6 99.63 224 104 224h176C284.4 224 288 227.6 288 232V248zM288 184C288 188.4 284.4 192 280 192h-176C99.63 192 96 188.4 96 184v-16C96 163.6 99.63 160 104 160h176C284.4 160 288 163.6 288 168V184z"/></svg>"""
		else -> null
	}
	
}
