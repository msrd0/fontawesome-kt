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

object FA_FROG: Icon {
	
	override val name get() = "Frog"
	
	override val unicode get() = "f52e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M528 416h-32.07l-90.32-96.34l140.6-79.03c18.38-10.25 29.75-29.62 29.75-50.62c0-21.5-11.75-41-30.5-51.25c-40.5-22.25-99.07-41.43-99.07-41.43C439.6 60.19 407.3 32 368 32s-71.77 28.25-78.52 65.5C126.7 113-.4999 250.1 .0001 417C.1251 451.9 29.13 480 64 480h304c8.875 0 16-7.125 16-16c0-26.51-21.49-48-47.1-48H284.3l23.93-32.38c24.25-36.13 10.38-88.25-33.63-106.5C250.8 267.1 223 272.4 202.4 288L169.6 312.5c-7.125 5.375-17.12 4-22.38-3.125c-5.375-7.125-4-17.12 3.125-22.38l34.75-26.12c36.87-27.62 88.37-27.62 125.1 0c10.88 8.125 45.88 39 40.88 93.13L469.6 480h90.38c8.875 0 16-7.125 16-16C576 437.5 554.5 416 528 416zM344 112c0-13.25 10.75-24 24-24s24 10.75 24 24s-10.75 24-24 24S344 125.3 344 112z"/></svg>"""
		else -> null
	}
	
}
