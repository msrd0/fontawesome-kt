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

object FA_BUCKET: Icon {
	
	override val name get() = "Bucket"
	
	override val unicode get() = "e4cf"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M96 160H48V152C48 68.05 116.1 0 200 0H248C331.9 0 400 68.05 400 152V160H352V152C352 94.56 305.4 48 248 48H200C142.6 48 96 94.56 96 152V160zM.0003 224C.0003 206.3 14.33 192 32 192H416C433.7 192 448 206.3 448 224C448 241.7 433.7 256 416 256H410.9L388.5 469C385.1 493.5 365.4 512 340.8 512H107.2C82.65 512 62.05 493.5 59.48 469L37.05 256H32C14.33 256 0 241.7 0 224H.0003z"/></svg>"""
		else -> null
	}
	
}
