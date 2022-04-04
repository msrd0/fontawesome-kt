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

/** Scale unbalanced flip */
object FA_SCALE_UNBALANCED_FLIP: Icon {
	
	override val name get() = "Scale unbalanced flip"
	
	override val unicode get() = "f516"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M554.9 250.5c-17.62-35.37-68.12-35.25-85.87 0c-86.38 172.7-85.04 165.4-85.04 181.5C383.1 476.1 441.3 512 512 512s127.1-35.88 127.1-79.1C639.1 416.4 642 424.7 554.9 250.5zM439.9 416l72.15-143.1l71.98 143.1H439.9zM512 192c13.41 0 25.89-8.471 30.36-21.88c5.594-16.76-3.469-34.89-20.23-40.48l-122.1-40.1c.3125-2.877 .8712-5.687 .8712-8.648c0-44.18-35.81-80-79.1-80c-29.29 0-54.65 15.92-68.58 39.41l-113.3-37.76C121.3-3.963 103.2 5.162 97.64 21.9C92.05 38.66 101.1 56.78 117.9 62.38l126.3 42.11c7.061 21.84 22.95 39.65 43.78 48.77v294.7H144c-26.51 0-47.1 21.49-47.1 47.1C96 504.8 103.2 512 112 512h223.1c8.836 0 15.1-7.164 15.1-15.1V153.3c5.043-2.207 9.756-4.965 14.19-8.115l135.7 45.23C505.2 191.5 508.7 192 512 192zM256 304c0-15.62 1.1-7.252-85.12-181.5c-17.62-35.37-68.08-35.25-85.83 0c-86.38 172.7-85.04 165.4-85.04 181.5c0 44.12 57.25 79.1 127.1 79.1S256 348.1 256 304zM128 144l72.04 143.1H55.92L128 144z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_SCALE_UNBALANCED_FLIP]. */
val FA_BALANCE_SCALE_RIGHT = FA_SCALE_UNBALANCED_FLIP