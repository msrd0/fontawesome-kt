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

/** Outdent */
object FA_OUTDENT: Icon {
	
	override val name get() = "Outdent"
	
	override val unicode get() = "f03b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M32 64C32 46.33 46.33 32 64 32H448C465.7 32 480 46.33 480 64C480 81.67 465.7 96 448 96H64C46.33 96 32 81.67 32 64V64zM224 192C224 174.3 238.3 160 256 160H448C465.7 160 480 174.3 480 192C480 209.7 465.7 224 448 224H256C238.3 224 224 209.7 224 192zM448 288C465.7 288 480 302.3 480 320C480 337.7 465.7 352 448 352H256C238.3 352 224 337.7 224 320C224 302.3 238.3 288 256 288H448zM32 448C32 430.3 46.33 416 64 416H448C465.7 416 480 430.3 480 448C480 465.7 465.7 480 448 480H64C46.33 480 32 465.7 32 448V448zM32.24 268.6C24 262.2 24 249.8 32.24 243.4L134.2 164.1C144.7 155.9 160 163.4 160 176.7V335.3C160 348.6 144.7 356.1 134.2 347.9L32.24 268.6z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_OUTDENT]. */
val FA_DEDENT = FA_OUTDENT
