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

/** Indent */
object FA_INDENT: Icon {
	
	override val name get() = "Indent"
	
	override val unicode get() = "f03c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M0 64C0 46.33 14.33 32 32 32H416C433.7 32 448 46.33 448 64C448 81.67 433.7 96 416 96H32C14.33 96 0 81.67 0 64zM192 192C192 174.3 206.3 160 224 160H416C433.7 160 448 174.3 448 192C448 209.7 433.7 224 416 224H224C206.3 224 192 209.7 192 192zM416 288C433.7 288 448 302.3 448 320C448 337.7 433.7 352 416 352H224C206.3 352 192 337.7 192 320C192 302.3 206.3 288 224 288H416zM0 448C0 430.3 14.33 416 32 416H416C433.7 416 448 430.3 448 448C448 465.7 433.7 480 416 480H32C14.33 480 0 465.7 0 448zM25.82 347.9C15.31 356.1 0 348.6 0 335.3V176.7C0 163.4 15.31 155.9 25.82 164.1L127.8 243.4C135.1 249.8 135.1 262.2 127.8 268.6L25.82 347.9z"/></svg>"""
		else -> null
	}
	
}
