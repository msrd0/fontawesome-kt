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

object FA_ARROW_UP_RIGHT_DOTS: Icon {
	
	override val name get() = "Arrow Up-right-dots"
	
	override val unicode get() = "e4b7"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M287.1 0C305.7 0 320 14.33 320 32V160C320 177.7 305.7 192 287.1 192C270.3 192 255.1 177.7 255.1 160V109.3L54.63 310.6C42.13 323.1 21.87 323.1 9.372 310.6C-3.124 298.1-3.124 277.9 9.372 265.4L210.7 64H159.1C142.3 64 127.1 49.67 127.1 32C127.1 14.33 142.3 0 159.1 0H287.1zM576 80C576 106.5 554.5 128 528 128C501.5 128 480 106.5 480 80C480 53.49 501.5 32 528 32C554.5 32 576 53.49 576 80zM448 208C448 234.5 426.5 256 400 256C373.5 256 352 234.5 352 208C352 181.5 373.5 160 400 160C426.5 160 448 181.5 448 208zM352 336C352 309.5 373.5 288 400 288C426.5 288 448 309.5 448 336C448 362.5 426.5 384 400 384C373.5 384 352 362.5 352 336zM448 464C448 490.5 426.5 512 400 512C373.5 512 352 490.5 352 464C352 437.5 373.5 416 400 416C426.5 416 448 437.5 448 464zM576 464C576 490.5 554.5 512 528 512C501.5 512 480 490.5 480 464C480 437.5 501.5 416 528 416C554.5 416 576 437.5 576 464zM223.1 336C223.1 309.5 245.5 288 271.1 288C298.5 288 320 309.5 320 336C320 362.5 298.5 384 271.1 384C245.5 384 223.1 362.5 223.1 336zM320 464C320 490.5 298.5 512 271.1 512C245.5 512 223.1 490.5 223.1 464C223.1 437.5 245.5 416 271.1 416C298.5 416 320 437.5 320 464zM95.1 464C95.1 437.5 117.5 416 143.1 416C170.5 416 191.1 437.5 191.1 464C191.1 490.5 170.5 512 143.1 512C117.5 512 95.1 490.5 95.1 464zM576 336C576 362.5 554.5 384 528 384C501.5 384 480 362.5 480 336C480 309.5 501.5 288 528 288C554.5 288 576 309.5 576 336zM480 208C480 181.5 501.5 160 528 160C554.5 160 576 181.5 576 208C576 234.5 554.5 256 528 256C501.5 256 480 234.5 480 208z"/></svg>"""
		else -> null
	}
	
}
