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

object FA_SECTION: Icon {
	
	override val name get() = "Section"
	
	override val unicode get() = "e447"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 256 512"><path d="M224.5 337.4c15.66-14.28 26.09-33.12 29.8-55.82c14.46-88.44-64.67-112.4-117-128.2L124.7 149.5C65.67 131.2 61.11 119.4 64.83 96.79c1.531-9.344 5.715-16.19 13.21-21.56c14.74-10.56 39.94-13.87 69.23-9.029c10.74 1.75 24.36 5.686 41.66 12.03c16.58 6 34.98-2.438 41.04-19.06c6.059-16.59-2.467-34.97-19.05-41.06c-21.39-7.842-38.35-12.62-53.28-15.06c-46.47-7.781-88.1-.5313-116.9 20.19C19.46 38.52 5.965 60.39 1.686 86.48C-5.182 128.6 9.839 156 31.47 174.7C15.87 188.1 5.406 207.8 1.686 230.5C-12.59 317.9 67.36 342.7 105.7 354.6l12.99 3.967c64.71 19.56 76.92 29.09 72.42 56.59c-1.279 7.688-4.84 18.75-21.23 26.16c-15.27 6.906-37.01 8.406-61.4 4.469c-16.74-2.656-37.32-10.5-55.49-17.41l-9.773-3.719c-16.52-6.156-34.95 2.25-41.16 18.75c-6.184 16.56 2.186 34.1 18.74 41.19l9.463 3.594c21.05 8 44.94 17.12 68.02 20.75c12.21 2.031 24.14 3.032 35.54 3.032c23.17 0 44.28-4.157 62.4-12.34c31.95-14.44 52.53-40.75 58.02-74.12C261.1 383.6 246.8 356.3 224.5 337.4zM64.83 240.8c3.303-20.28 21.22-28.1 38.09-31.04c.9258 .2891 15.81 4.852 15.81 4.852c64.71 19.56 76.92 29.09 72.39 56.62c-3.291 20.2-21.12 28.07-37.93 31.04c-5.488-1.746-28.49-8.754-28.49-8.754C65.67 275.2 61.11 263.4 64.83 240.8z"/></svg>"""
		else -> null
	}
	
}
