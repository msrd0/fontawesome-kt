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

/** Temperature arrow up */
object FA_TEMPERATURE_ARROW_UP: Icon {
	
	override val name get() = "Temperature arrow up"
	
	override val unicode get() = "e040"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M159.1 322.9V112C159.1 103.1 152.9 96 144 96C135.1 96 128 103.1 128 112v210.9c-22 7.875-35.25 30.38-31.25 53.38C100.6 399.4 120.6 416.1 144 416.1c23.37 0 43.37-16.71 47.25-39.83C195.2 353.3 181.1 330.8 159.1 322.9zM255.1 112C255.1 50.13 205.9 0 144 0C82.13 0 32 50.13 32 112v166.5C12.25 303.3 0 334 0 368C0 447.5 64.5 512 144 512c79.5 0 143.1-64.5 143.1-144c0-34-12.25-64.88-32-89.5V112zM219.9 393.4C208.1 426.1 178.4 447.1 144 447.1c-34.38 0-65-21.84-75.88-54.59C57.25 360.8 68.5 324.9 96 304.3V112c0-26.5 21.5-48.01 48-48.01c26.5 0 47.1 21.51 47.1 48.01v192.3C219.5 324.9 230.7 360.8 219.9 393.4zM504.1 124l-64-80c-12.12-15.19-37.84-15.19-49.97 0l-64 80c-11.05 13.81-8.812 33.94 5 45c13.75 11.03 33.94 8.781 44.97-5L384 155.2V448c0 17.69 14.33 32 32 32s32-14.31 32-32V155.2L455 164c6.312 7.906 15.61 12 25 12c7.016 0 14.08-2.281 19.97-7C513.8 157.9 516 137.8 504.1 124z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_TEMPERATURE_ARROW_UP]. */
val FA_TEMPERATURE_UP = FA_TEMPERATURE_ARROW_UP
