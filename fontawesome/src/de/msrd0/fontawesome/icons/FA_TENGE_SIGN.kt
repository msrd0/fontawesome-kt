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

/** Tenge sign */
object FA_TENGE_SIGN: Icon {
	
	override val name get() = "Tenge sign"
	
	override val unicode get() = "f7d7"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M0 64C0 46.33 14.33 32 32 32H352C369.7 32 384 46.33 384 64C384 81.67 369.7 96 352 96H32C14.33 96 0 81.67 0 64zM0 192C0 174.3 14.33 160 32 160H352C369.7 160 384 174.3 384 192C384 209.7 369.7 224 352 224H224V448C224 465.7 209.7 480 192 480C174.3 480 160 465.7 160 448V224H32C14.33 224 0 209.7 0 192z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_TENGE_SIGN]. */
val FA_TENGE = FA_TENGE_SIGN
