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

/** Trailer */
object FA_TRAILER: Icon {
	
	override val name get() = "Trailer"
	
	override val unicode get() = "e041"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M496 32C522.5 32 544 53.49 544 80V320H608C625.7 320 640 334.3 640 352C640 369.7 625.7 384 608 384H286.9C279.1 329.7 232.4 288 176 288C119.6 288 72.9 329.7 65.13 384H48C21.49 384 0 362.5 0 336V80C0 53.49 21.49 32 48 32H496zM64 112V264.2C73.83 256.1 84.55 249 96 243.2V112C96 103.2 88.84 96 80 96C71.16 96 64 103.2 64 112V112zM176 224C181.4 224 186.7 224.2 192 224.7V112C192 103.2 184.8 96 176 96C167.2 96 160 103.2 160 112V224.7C165.3 224.2 170.6 224 176 224zM256 243.2C267.4 249 278.2 256.1 288 264.2V112C288 103.2 280.8 96 272 96C263.2 96 256 103.2 256 112V243.2zM352 112V304C352 312.8 359.2 320 368 320C376.8 320 384 312.8 384 304V112C384 103.2 376.8 96 368 96C359.2 96 352 103.2 352 112zM480 112C480 103.2 472.8 96 464 96C455.2 96 448 103.2 448 112V304C448 312.8 455.2 320 464 320C472.8 320 480 312.8 480 304V112zM96 400C96 355.8 131.8 320 176 320C220.2 320 256 355.8 256 400C256 444.2 220.2 480 176 480C131.8 480 96 444.2 96 400zM176 432C193.7 432 208 417.7 208 400C208 382.3 193.7 368 176 368C158.3 368 144 382.3 144 400C144 417.7 158.3 432 176 432z"/></svg>"""
		else -> null
	}
	
}
