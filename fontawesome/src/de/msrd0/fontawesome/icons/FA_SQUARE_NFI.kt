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

object FA_SQUARE_NFI: Icon {
	
	override val name get() = "Square Nfi"
	
	override val unicode get() = "e576"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M0 96C0 60.65 28.65 32 64 32H384C419.3 32 448 60.65 448 96V416C448 451.3 419.3 480 384 480H64C28.65 480 0 451.3 0 416V96zM64 176V336C64 344.8 71.16 352 80 352C88.84 352 96 344.8 96 336V233.8L162.3 344.2C165.1 350.4 173.3 353.3 180.3 351.4C187.2 349.5 191.1 343.2 191.1 336V176C191.1 167.2 184.8 160 175.1 160C167.2 160 159.1 167.2 159.1 176V278.2L93.72 167.8C90.02 161.6 82.66 158.7 75.73 160.6C68.8 162.5 64 168.8 64 176V176zM224 336C224 344.8 231.2 352 240 352C248.8 352 256 344.8 256 336V256H304C312.8 256 320 248.8 320 240C320 231.2 312.8 224 304 224H256V192H304C312.8 192 320 184.8 320 176C320 167.2 312.8 160 304 160H240C231.2 160 224 167.2 224 176V336zM384 176C384 167.2 376.8 160 368 160C359.2 160 352 167.2 352 176V336C352 344.8 359.2 352 368 352C376.8 352 384 344.8 384 336V176z"/></svg>"""
		else -> null
	}
	
}
