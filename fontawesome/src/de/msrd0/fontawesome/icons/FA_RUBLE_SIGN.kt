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

object FA_RUBLE_SIGN: Icon {
	
	override val name get() = "Ruble Sign"
	
	override val unicode get() = "f158"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M240 32C319.5 32 384 96.47 384 176C384 255.5 319.5 320 240 320H128V352H288C305.7 352 320 366.3 320 384C320 401.7 305.7 416 288 416H128V448C128 465.7 113.7 480 96 480C78.33 480 64 465.7 64 448V416H32C14.33 416 0 401.7 0 384C0 366.3 14.33 352 32 352H64V320H32C14.33 320 0 305.7 0 288C0 270.3 14.33 256 32 256H64V64C64 46.33 78.33 32 96 32H240zM320 176C320 131.8 284.2 96 240 96H128V256H240C284.2 256 320 220.2 320 176z"/></svg>"""
		else -> null
	}
	
}

val FA_ROUBLE = FA_RUBLE_SIGN

val FA_RUB = FA_RUBLE_SIGN

val FA_RUBLE = FA_RUBLE_SIGN
