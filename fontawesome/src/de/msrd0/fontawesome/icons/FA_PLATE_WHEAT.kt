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

object FA_PLATE_WHEAT: Icon {
	
	override val name get() = "Plate Wheat"
	
	override val unicode get() = "e55a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M256 112V128C256 136.8 248.8 144 240 144C195.8 144 160 108.2 160 64V48C160 39.16 167.2 32 176 32C220.2 32 256 67.82 256 112zM104 64C117.3 64 128 74.75 128 88C128 101.3 117.3 112 104 112H56C42.75 112 32 101.3 32 88C32 74.75 42.75 64 56 64H104zM136 136C149.3 136 160 146.7 160 160C160 173.3 149.3 184 136 184H24C10.75 184 0 173.3 0 160C0 146.7 10.75 136 24 136H136zM32 232C32 218.7 42.75 208 56 208H104C117.3 208 128 218.7 128 232C128 245.3 117.3 256 104 256H56C42.75 256 32 245.3 32 232zM272 48C272 39.16 279.2 32 288 32C332.2 32 368 67.82 368 112V128C368 136.8 360.8 144 352 144C307.8 144 272 108.2 272 64V48zM480 112V128C480 136.8 472.8 144 464 144C419.8 144 384 108.2 384 64V48C384 39.16 391.2 32 400 32C444.2 32 480 67.82 480 112zM480 208C480 252.2 444.2 288 400 288C391.2 288 384 280.8 384 272V256C384 211.8 419.8 176 464 176C472.8 176 480 183.2 480 192V208zM352 176C360.8 176 368 183.2 368 192V208C368 252.2 332.2 288 288 288C279.2 288 272 280.8 272 272V256C272 211.8 307.8 176 352 176zM256 208C256 252.2 220.2 288 176 288C167.2 288 160 280.8 160 272V256C160 211.8 195.8 176 240 176C248.8 176 256 183.2 256 192V208zM0 352C0 334.3 14.33 320 32 320H480C497.7 320 512 334.3 512 352C512 411.7 471.1 461.9 415.8 476C415.9 477.3 416 478.7 416 480C416 497.7 401.7 512 384 512H128C110.3 512 96 497.7 96 480C96 478.7 96.08 477.3 96.24 476C40.91 461.9 0 411.7 0 352V352z"/></svg>"""
		else -> null
	}
	
}
