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

object FA_JUG_DETERGENT: Icon {
	
	override val name get() = "Jug Detergent"
	
	override val unicode get() = "e519"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M96 24C96 10.75 106.7 0 120 0H200C213.3 0 224 10.75 224 24V48H232C245.3 48 256 58.75 256 72C256 85.25 245.3 96 232 96H88C74.75 96 64 85.25 64 72C64 58.75 74.75 48 88 48H96V24zM0 256C0 185.3 57.31 128 128 128H256C326.7 128 384 185.3 384 256V448C384 483.3 355.3 512 320 512H64C28.65 512 0 483.3 0 448V256zM256 352C256 369.7 270.3 384 288 384C305.7 384 320 369.7 320 352V256C320 238.3 305.7 224 288 224C270.3 224 256 238.3 256 256V352z"/></svg>"""
		else -> null
	}
	
}
