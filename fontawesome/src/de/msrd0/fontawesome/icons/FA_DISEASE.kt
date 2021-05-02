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

object FA_DISEASE: Icon {
	
	override val name get() = "Disease"
	
	override val unicode get() = "f7fa"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M472.29 195.9l-67.06-23c-19.28-6.6-33.54-20.92-38.14-38.31l-16-60.45c-11.58-43.77-76.57-57.13-110-22.62L195 99.24c-13.26 13.71-33.54 20.93-54.2 19.31l-71.9-5.62c-52-4.07-86.93 44.89-59 82.84l38.54 52.42c11.08 15.07 12.82 33.86 4.64 50.24l-28.43 57C4 396.67 47.46 440.29 98.11 429.23l70-15.28c20.11-4.39 41.45 0 57.07 11.73l54.32 40.83c39.32 29.56 101 7.57 104.45-37.22l4.7-61.86c1.35-17.8 12.8-33.87 30.63-43l62-31.74c44.84-22.96 39.55-80.17-8.99-96.79zM160 256a32 32 0 1 1 32-32 32 32 0 0 1-32 32zm128 96a32 32 0 1 1 32-32 32 32 0 0 1-32 32zm16-128a16 16 0 1 1 16-16 16 16 0 0 1-16 16z"/></svg>"""
		else -> null
	}
	
}
