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

/** Temperature arrow down */
object FA_TEMPERATURE_ARROW_DOWN: Icon {
	
	override val name get() = "Temperature arrow down"
	
	override val unicode get() = "e03f"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M159.1 322.9l-.0002-18.92C159.1 295.1 152.9 287.1 144 287.1c-8.875 0-15.1 7.115-15.1 15.99L128 322.9c-22 7.875-35.25 30.38-31.25 53.38C100.6 399.4 120.6 416.1 144 416.1c23.37 0 43.37-16.71 47.25-39.83C195.2 353.3 181.1 330.8 159.1 322.9zM255.1 112C255.1 50.13 205.9 0 144 0C82.13 0 32 50.13 32 112v166.5C12.25 303.3 0 334 0 368C0 447.5 64.5 512 144 512c79.5 0 143.1-64.5 143.1-144c0-34-12.25-64.88-32-89.5V112zM219.9 393.4C208.1 426.1 178.4 447.1 144 447.1c-34.38 0-65-21.84-75.88-54.59C57.25 360.8 68.5 324.9 96 304.3V112C96 85.5 117.5 64 144 64c26.5 0 47.1 21.5 47.1 48v192.3C219.5 324.9 230.7 360.8 219.9 393.4zM499.1 343c-13.77-11.03-33.92-8.75-44.97 5L448 356.8V64c0-17.69-14.33-32-32-32s-32 14.31-32 32v292.8L376.1 348c-11.03-13.81-31.19-16.03-44.97-5c-13.81 11.06-16.05 31.19-5 45l64 80C397.1 475.6 406.3 480 416 480s18.92-4.406 24.98-12l64-80C516 374.2 513.8 354.1 499.1 343z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_TEMPERATURE_ARROW_DOWN]. */
val FA_TEMPERATURE_DOWN = FA_TEMPERATURE_ARROW_DOWN
