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

object FA_DOLLY: Icon {
	
	override val name get() = "Dolly"
	
	override val unicode get() = "f472"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M294.2 277.8c17.1 5 34.62 13.38 49.5 24.62l161.5-53.75c8.375-2.875 12.88-11.88 10-20.25L454.8 47.25c-2.748-8.502-11.88-13-20.12-10.12l-61.13 20.37l33.12 99.38l-60.75 20.13l-33.12-99.38L251.2 98.13c-8.373 2.75-12.87 11.88-9.998 20.12L294.2 277.8zM574.4 309.9c-5.594-16.75-23.67-25.91-40.48-20.23l-202.5 67.51c-17.22-22.01-43.57-36.41-73.54-36.97L165.7 43.75C156.9 17.58 132.5 0 104.9 0H32C14.33 0 0 14.33 0 32s14.33 32 32 32h72.94l92.22 276.7C174.7 358.2 160 385.3 160 416c0 53.02 42.98 96 96 96c52.4 0 94.84-42.03 95.82-94.2l202.3-67.44C570.9 344.8 579.1 326.6 574.4 309.9zM256 448c-17.67 0-32-14.33-32-32c0-17.67 14.33-31.1 32-31.1S288 398.3 288 416C288 433.7 273.7 448 256 448z"/></svg>"""
		else -> null
	}
	
}

val FA_DOLLY_BOX = FA_DOLLY
