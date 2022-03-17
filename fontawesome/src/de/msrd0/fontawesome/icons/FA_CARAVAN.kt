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

object FA_CARAVAN: Icon {
	
	override val name get() = "Caravan"
	
	override val unicode get() = "f8ff"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M0 112C0 67.82 35.82 32 80 32H416C504.4 32 576 103.6 576 192V352H608C625.7 352 640 366.3 640 384C640 401.7 625.7 416 608 416H288C288 469 245 512 192 512C138.1 512 96 469 96 416H80C35.82 416 0 380.2 0 336V112zM320 352H448V256H416C407.2 256 400 248.8 400 240C400 231.2 407.2 224 416 224H448V160C448 142.3 433.7 128 416 128H352C334.3 128 320 142.3 320 160V352zM96 128C78.33 128 64 142.3 64 160V224C64 241.7 78.33 256 96 256H224C241.7 256 256 241.7 256 224V160C256 142.3 241.7 128 224 128H96zM192 464C218.5 464 240 442.5 240 416C240 389.5 218.5 368 192 368C165.5 368 144 389.5 144 416C144 442.5 165.5 464 192 464z"/></svg>"""
		else -> null
	}
	
}
