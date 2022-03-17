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

object FA_MATTRESS_PILLOW: Icon {
	
	override val name get() = "Mattress Pillow"
	
	override val unicode get() = "e525"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M256 448H64C28.65 448 0 419.3 0 384V128C0 92.65 28.65 64 64 64H256V448zM64 352C64 369.7 78.33 384 96 384H160C177.7 384 192 369.7 192 352V160C192 142.3 177.7 128 160 128H96C78.33 128 64 142.3 64 160V352zM288 64H576C611.3 64 640 92.65 640 128V384C640 419.3 611.3 448 576 448H288V64z"/></svg>"""
		else -> null
	}
	
}
