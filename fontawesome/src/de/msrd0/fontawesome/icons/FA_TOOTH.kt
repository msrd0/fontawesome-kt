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

/** Tooth */
object FA_TOOTH: Icon {
	
	override val name get() = "Tooth"
	
	override val unicode get() = "f5c9"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M394.1 212.8c-20.04 27.67-28.07 60.15-31.18 93.95c-3.748 41.34-8.785 82.46-17.89 122.8l-6.75 29.64c-2.68 12.14-13.29 20.78-25.39 20.78c-12 0-22.39-8.311-25.29-20.23l-29.57-121.2C254.1 322.6 240.1 311.4 224 311.4c-16.18 0-30.21 11.26-34.07 27.23l-29.57 121.2c-2.893 11.92-13.39 20.23-25.29 20.23c-12.21 0-22.71-8.639-25.5-20.78l-6.643-29.64c-9.105-40.36-14.14-81.48-17.1-122.8C81.93 272.1 73.9 240.5 53.86 212.8c-18.75-25.92-27.11-60.15-18.43-96.57c9.428-39.59 40.39-71.75 78.85-82.03c20.14-5.25 39.54-.4375 57.32 9.077l86.14 56.54c6.643 4.375 15.11 1.86 18.96-4.264c4.07-6.454 2.25-15.09-4.18-19.36l-24.21-15.86c3-1.531 6.215-2.735 9-4.813c22.39-16.84 48.75-28.65 76.39-21.33c38.46 10.28 69.43 42.43 78.85 82.03C421.2 152.7 412.9 187 394.1 212.8z"/></svg>"""
		else -> null
	}
	
}
