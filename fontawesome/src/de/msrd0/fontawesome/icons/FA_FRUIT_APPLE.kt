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

object FA_FRUIT_APPLE: Icon {
	
	override val name get() = "Fruit Apple"
	
	override val unicode get() = "f5d1"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M350.85 129c25.97 4.67 47.27 18.67 63.92 42 14.65 20.67 24.64 46.67 29.96 78 4.67 28.67 4.32 57.33-1 86-7.99 47.33-23.97 87-47.94 119-28.64 38.67-64.59 58-107.87 58-10.66 0-22.3-3.33-34.96-10-8.66-5.33-18.31-8-28.97-8s-20.3 2.67-28.97 8c-12.66 6.67-24.3 10-34.96 10-43.28 0-79.23-19.33-107.87-58-23.97-32-39.95-71.67-47.94-119-5.32-28.67-5.67-57.33-1-86 5.32-31.33 15.31-57.33 29.96-78 16.65-23.33 37.95-37.33 63.92-42 15.98-2.67 37.95-.33 65.92 7 23.97 6.67 44.28 14.67 60.93 24 16.65-9.33 36.96-17.33 60.93-24 27.98-7.33 49.96-9.67 65.94-7zm-54.94-41c-9.32 8.67-21.65 15-36.96 19-10.66 3.33-22.3 5-34.96 5l-14.98-1c-1.33-9.33-1.33-20 0-32 2.67-24 10.32-42.33 22.97-55 9.32-8.67 21.65-15 36.96-19 10.66-3.33 22.3-5 34.96-5l14.98 1 1 15c0 12.67-1.67 24.33-4.99 35-3.99 15.33-10.31 27.67-18.98 37z"/></svg>"""
		else -> null
	}
	
}
