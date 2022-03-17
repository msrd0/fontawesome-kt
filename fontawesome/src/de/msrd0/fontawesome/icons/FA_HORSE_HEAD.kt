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

object FA_HORSE_HEAD: Icon {
	
	override val name get() = "Horse Head"
	
	override val unicode get() = "f7ab"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M509.8 332.5l-69.89-164.3c-14.88-41.25-50.38-70.98-93.01-79.24c18-10.63 46.35-35.9 34.23-82.29c-1.375-5.001-7.112-7.972-11.99-6.097l-202.3 75.66C35.89 123.4 0 238.9 0 398.8v81.24C0 497.7 14.25 512 32 512h236.2c23.75 0 39.3-25.03 28.55-46.28l-40.78-81.71V383.3c-45.63-3.5-84.66-30.7-104.3-69.58c-1.625-3.125-.9342-6.951 1.566-9.327l12.11-12.11c3.875-3.875 10.64-2.692 12.89 2.434c14.88 33.63 48.17 57.38 87.42 57.38c17.13 0 33.05-5.091 46.8-13.22l46 63.9c6 8.501 15.75 13.34 26 13.34h50.28c8.501 0 16.61-3.388 22.61-9.389l45.34-39.84C511.6 357.7 514.4 344.2 509.8 332.5zM328.1 223.1c-13.25 0-23.96-10.75-23.96-24c0-13.25 10.75-23.92 24-23.92s23.94 10.73 23.94 23.98C352 213.3 341.3 223.1 328.1 223.1z"/></svg>"""
		else -> null
	}
	
}
