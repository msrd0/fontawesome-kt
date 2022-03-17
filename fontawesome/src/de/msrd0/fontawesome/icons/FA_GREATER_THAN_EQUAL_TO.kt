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

object FA_GREATER_THAN_EQUAL_TO: Icon {
	
	override val name get() = "Greater Than Equal To"
	
	override val unicode get() = "f532"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M34.28 331.9c5.016 12.53 17.03 20.12 29.73 20.12c3.953 0 7.969-.7187 11.88-2.281l320-127.1C408 216.9 416 205.1 416 192s-7.969-24.85-20.11-29.72l-320-128c-16.47-6.594-35.05 1.406-41.61 17.84C27.72 68.55 35.7 87.17 52.11 93.73l245.7 98.28L52.11 290.3C35.7 296.9 27.72 315.5 34.28 331.9zM416 416H32c-17.67 0-32 14.31-32 31.99s14.33 32.01 32 32.01h384c17.67 0 32-14.32 32-32.01S433.7 416 416 416z"/></svg>"""
		else -> null
	}
	
}
