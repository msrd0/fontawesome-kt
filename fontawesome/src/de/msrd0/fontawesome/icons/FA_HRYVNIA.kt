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

object FA_HRYVNIA: Icon {
	
	override val name get() = "Hryvnia"
	
	override val unicode get() = "f6f2"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M368 240c8.84 0 16-7.16 16-16v-32c0-8.84-7.16-16-16-16h-41.86c13.41-28.63 13.74-63.33-4.13-94.05C303.34 49.84 267.1 32 229.96 32h-78.82c-24.32 0-47.86 8.53-66.54 24.09L72.83 65.9c-10.18 8.49-11.56 23.62-3.07 33.8l20.49 24.59c8.49 10.19 23.62 11.56 33.81 3.07l11.73-9.78c4.32-3.6 9.77-5.57 15.39-5.57h83.62c11.69 0 21.2 9.52 21.2 21.2 0 5.91-2.48 11.58-6.81 15.58L219.7 176H16c-8.84 0-16 7.16-16 16v32c0 8.84 7.16 16 16 16h134.37l-34.67 32H16c-8.84 0-16 7.16-16 16v32c0 8.84 7.16 16 16 16h41.86c-13.41 28.63-13.74 63.33 4.13 94.05C80.66 462.15 116.9 480 154.04 480h78.82c24.32 0 47.86-8.53 66.54-24.09l11.77-9.81c10.18-8.49 11.56-23.62 3.07-33.8l-20.49-24.59c-8.49-10.19-23.62-11.56-33.81-3.07l-11.75 9.8a23.992 23.992 0 0 1-15.36 5.56H149.2c-11.69 0-21.2-9.52-21.2-21.2 0-5.91 2.48-11.58 6.81-15.58L164.3 336H368c8.84 0 16-7.16 16-16v-32c0-8.84-7.16-16-16-16H233.63l34.67-32H368z"/></svg>"""
		else -> null
	}
	
}
