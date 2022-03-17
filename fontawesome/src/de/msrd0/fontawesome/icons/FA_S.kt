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

/** S */
object FA_S: Icon {
	
	override val name get() = "S"
	
	override val unicode get() = "53"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M349.9 379.1c-6.281 36.63-25.89 65.02-56.69 82.11c-24.91 13.83-54.08 18.98-83.73 18.98c-61.86 0-125.8-22.42-157.5-35.38c-16.38-6.672-24.22-25.34-17.55-41.7c6.641-16.36 25.27-24.28 41.7-17.55c77.56 31.64 150.6 39.39 186.1 19.69c13.83-7.672 21.67-19.42 24.69-36.98c7.25-42.31-18.2-56.75-103.7-81.38C112.6 266.6 15.98 238.7 34.11 133.2c5.484-32 23.64-59.36 51.14-77.02c45.59-29.33 115-31.87 206.4-7.688c17.09 4.531 27.27 22.05 22.75 39.13s-22.06 27.23-39.13 22.75C184 86.17 140.4 96.81 119.8 110c-12.55 8.062-20.17 19.5-22.66 34c-7.266 42.31 18.19 56.75 103.7 81.38C271.4 245.7 368 273.5 349.9 379.1z"/></svg>"""
		else -> null
	}
	
}
