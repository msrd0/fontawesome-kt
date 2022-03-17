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

object FA_VAULT: Icon {
	
	override val name get() = "Vault"
	
	override val unicode get() = "e2c5"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M144 240C144 195.8 179.8 160 224 160C268.2 160 304 195.8 304 240C304 284.2 268.2 320 224 320C179.8 320 144 284.2 144 240zM512 0C547.3 0 576 28.65 576 64V416C576 451.3 547.3 480 512 480H496L480 512H416L400 480H176L160 512H96L80 480H64C28.65 480 0 451.3 0 416V64C0 28.65 28.65 0 64 0H512zM224 400C312.4 400 384 328.4 384 240C384 151.6 312.4 80 224 80C135.6 80 64 151.6 64 240C64 328.4 135.6 400 224 400zM480 221.3C498.6 214.7 512 196.9 512 176C512 149.5 490.5 128 464 128C437.5 128 416 149.5 416 176C416 196.9 429.4 214.7 448 221.3V336C448 344.8 455.2 352 464 352C472.8 352 480 344.8 480 336V221.3z"/></svg>"""
		else -> null
	}
	
}
