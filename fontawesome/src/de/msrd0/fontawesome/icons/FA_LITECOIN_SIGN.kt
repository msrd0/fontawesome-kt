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

/** Litecoin Sign */
object FA_LITECOIN_SIGN: Icon {
	
	override val name get() = "Litecoin Sign"
	
	override val unicode get() = "e1d3"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M128 195.3L247.2 161.2C264.2 156.4 281.9 166.2 286.8 183.2C291.6 200.2 281.8 217.9 264.8 222.8L128 261.9V416H352C369.7 416 384 430.3 384 448C384 465.7 369.7 480 352 480H96C78.33 480 64 465.7 64 448V280.1L40.79 286.8C23.8 291.6 6.087 281.8 1.232 264.8C-3.623 247.8 6.216 230.1 23.21 225.2L64 213.6V64C64 46.33 78.33 32 96 32C113.7 32 128 46.33 128 64V195.3z"/></svg>"""
		else -> null
	}
	
}
