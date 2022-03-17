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

object FA_ICICLES: Icon {
	
	override val name get() = "Icicles"
	
	override val unicode get() = "f7ad"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M511.4 37.87l-87.54 467.6c-1.625 8.623-14.04 8.634-15.67 .0104L341.4 141.7L295.7 314.2c-2.375 7.624-12.98 7.624-15.36 0L246.3 180.9l-46.49 196.9c-1.875 8.373-13.64 8.373-15.51 0L139.1 190.5L103.6 314.5c-2.375 7.124-12.64 7.198-15.14 .0744L1.357 41.24C-4.768 20.75 10.61 0 31.98 0h448C500 0 515.2 18.25 511.4 37.87z"/></svg>"""
		else -> null
	}
	
}
