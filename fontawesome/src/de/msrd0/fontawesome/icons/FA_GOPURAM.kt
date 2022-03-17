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

object FA_GOPURAM: Icon {
	
	override val name get() = "Gopuram"
	
	override val unicode get() = "f664"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M120 0C133.3 0 144 10.75 144 24V32H184V24C184 10.75 194.7 0 208 0C221.3 0 232 10.75 232 24V32H280V24C280 10.75 290.7 0 304 0C317.3 0 328 10.75 328 24V32H368V24C368 10.75 378.7 0 392 0C405.3 0 416 10.75 416 24V128C433.7 128 448 142.3 448 160V224C465.7 224 480 238.3 480 256V352C497.7 352 512 366.3 512 384V480C512 497.7 497.7 512 480 512H416V352H384V224H352V128H320V224H352V352H384V512H304V464C304 437.5 282.5 416 256 416C229.5 416 208 437.5 208 464V512H128V352H160V224H192V128H160V224H128V352H96V512H32C14.33 512 0 497.7 0 480V384C0 366.3 14.33 352 32 352V256C32 238.3 46.33 224 64 224V160C64 142.3 78.33 128 96 128V24C96 10.75 106.7 0 120 0zM256 272C238.3 272 224 286.3 224 304V352H288V304C288 286.3 273.7 272 256 272zM224 224H288V192C288 174.3 273.7 160 256 160C238.3 160 224 174.3 224 192V224z"/></svg>"""
		else -> null
	}
	
}
