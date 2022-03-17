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

object FA_VIALS: Icon {
	
	override val name get() = "Vials"
	
	override val unicode get() = "f493"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M200 32h-176C10.75 32 0 42.74 0 56C0 69.25 10.75 80 24 80H32v320C32 444.1 67.88 480 112 480S192 444.1 192 400v-320h8C213.3 80 224 69.25 224 56C224 42.74 213.3 32 200 32zM144 256h-64V80h64V256zM488 32h-176C298.7 32 288 42.74 288 56c0 13.25 10.75 24 24 24H320v320c0 44.13 35.88 80 80 80s80-35.88 80-80v-320h8C501.3 80 512 69.25 512 56C512 42.74 501.3 32 488 32zM432 256h-64V80h64V256z"/></svg>"""
		else -> null
	}
	
}
