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

/** Dong Sign */
object FA_DONG_SIGN: Icon {
	
	override val name get() = "Dong Sign"
	
	override val unicode get() = "e169"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M320 64C337.7 64 352 78.33 352 96C352 113.7 337.7 128 320 128V384C320 401.7 305.7 416 288 416C275 416 263.9 408.3 258.8 397.2C239.4 409.1 216.5 416 192 416C121.3 416 64 358.7 64 288C64 217.3 121.3 160 192 160C215.3 160 237.2 166.2 256 177.1V128H224C206.3 128 192 113.7 192 96C192 78.33 206.3 64 224 64H256C256 46.33 270.3 32 288 32C305.7 32 320 46.33 320 64V64zM256 288C256 252.7 227.3 224 192 224C156.7 224 128 252.7 128 288C128 323.3 156.7 352 192 352C227.3 352 256 323.3 256 288zM352 448C369.7 448 384 462.3 384 480C384 497.7 369.7 512 352 512H32C14.33 512 0 497.7 0 480C0 462.3 14.33 448 32 448H352z"/></svg>"""
		else -> null
	}
	
}
