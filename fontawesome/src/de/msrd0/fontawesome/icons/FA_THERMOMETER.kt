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

object FA_THERMOMETER: Icon {
	
	override val name get() = "Thermometer"
	
	override val unicode get() = "f491"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M483.1 162.6L229.8 415.9l-99.87-.0001l-88.99 89.02c-9.249 9.377-24.5 9.377-33.87 0c-9.374-9.252-9.374-24.51 0-33.88l88.99-89.02l.0003-100.9l49.05-49.39l51.6 51.59c3.125 3.126 7.218 4.688 11.31 4.688s8.187-1.563 11.31-4.688c6.249-6.252 6.249-16.38 0-22.63L167.6 209.1l41.24-41.52l51.81 51.81c3.125 3.126 7.218 4.688 11.31 4.688s8.187-1.563 11.31-4.688c6.249-6.252 6.249-16.38 0-22.63L231.4 144.8l41.24-41.52l52.02 52.02c3.125 3.126 7.218 4.688 11.31 4.688s8.187-1.563 11.31-4.688c6.249-6.252 6.249-16.38 0-22.63l-52.09-52.09l49.68-50.02c36.37-36.51 94.37-40.88 131.9-10.25C526.2 61.11 518.9 127.8 483.1 162.6z"/></svg>"""
		else -> null
	}
	
}
