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

object FA_GREATER_THAN: Icon {
	
	override val name get() = "Greater Than"
	
	override val unicode get() = "3e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M32.03 448c-11.75 0-23.05-6.469-28.66-17.69c-7.906-15.81-1.5-35.03 14.31-42.94l262.8-131.4L17.69 124.6C1.875 116.7-4.531 97.51 3.375 81.7c7.891-15.81 27.06-22.19 42.94-14.31l320 160C377.2 232.8 384 243.9 384 256c0 12.12-6.844 23.19-17.69 28.63l-320 160C41.72 446.9 36.83 448 32.03 448z"/></svg>"""
		else -> null
	}
	
}
