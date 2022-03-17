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

object FA_TREE_CITY: Icon {
	
	override val name get() = "Tree City"
	
	override val unicode get() = "e587"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M288 48C288 21.49 309.5 0 336 0H432C458.5 0 480 21.49 480 48V192H520V120C520 106.7 530.7 96 544 96C557.3 96 568 106.7 568 120V192H592C618.5 192 640 213.5 640 240V464C640 490.5 618.5 512 592 512H336C309.5 512 288 490.5 288 464V48zM352 112C352 120.8 359.2 128 368 128H400C408.8 128 416 120.8 416 112V80C416 71.16 408.8 64 400 64H368C359.2 64 352 71.16 352 80V112zM368 160C359.2 160 352 167.2 352 176V208C352 216.8 359.2 224 368 224H400C408.8 224 416 216.8 416 208V176C416 167.2 408.8 160 400 160H368zM352 304C352 312.8 359.2 320 368 320H400C408.8 320 416 312.8 416 304V272C416 263.2 408.8 256 400 256H368C359.2 256 352 263.2 352 272V304zM528 256C519.2 256 512 263.2 512 272V304C512 312.8 519.2 320 528 320H560C568.8 320 576 312.8 576 304V272C576 263.2 568.8 256 560 256H528zM512 400C512 408.8 519.2 416 528 416H560C568.8 416 576 408.8 576 400V368C576 359.2 568.8 352 560 352H528C519.2 352 512 359.2 512 368V400zM224 160C224 166 223 171 222 176C242 190 256 214 256 240C256 285 220 320 176 320H160V480C160 498 145 512 128 512C110 512 96 498 96 480V320H80C35 320 0 285 0 240C0 214 13 190 33 176C32 171 32 166 32 160C32 107 74 64 128 64C181 64 224 107 224 160z"/></svg>"""
		else -> null
	}
	
}
